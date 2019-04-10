package com.resourcr.loading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.Resource;




public class CustomResourceLoader  {

	Resource resource;
	
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public void showData() throws IOException
	{
		InputStream inputStream = resource.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		while(true)
		{
			String readLine = bufferedReader.readLine();
			if(readLine == null)
			break;
			System.out.println(readLine);
		}
		bufferedReader.close();
	}
	
}



/*public class CustomResourceLoader implements ResourceLoaderAware {

	private  ResourceLoader customResourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader customResourceLoader) {
		this.customResourceLoader = customResourceLoader;
	}

	
	public void showData() throws IOException
	{
		Resource resource = customResourceLoader.getResource("prop.properties");
		InputStream inputStream = resource.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		while(true)
		{
			String readLine = bufferedReader.readLine();
			if(readLine == null)
			break;
			System.out.println(readLine);
		}
		bufferedReader.close();
	}
	
}*/
