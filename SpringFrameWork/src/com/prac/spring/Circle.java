package com.prac.spring;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware // ,InitializingBean,DisposableBean,ApplicationContextAware
{

	ApplicationEventPublisher publisher;

	// @Resource(name="pointB")
	/*
	 * @Autowired
	 * 
	 * @Qualifier("circleRelated")
	 */
	
	@Resource(name = "pointB")
	public Point pointA;

	public ApplicationContext applicationContext;

	// @Autowired
	@Resource(name = "messageSource")
	MessageSource messageSource;

	/*
	 * public Point getPoint() { return pointA; }
	 */
	/*
	 * @Autowired
	 * 
	 * @Qualifier("circleRelated")
	 */
	// @Resource(name="pointB")
	/*
	 * public void setPoint(Point pointA) { this.pointA = pointA; }
	 */
	@Override
	public void draw() {

		/*System.out.println(
				messageSource.getMessage("get.points", new Object[] { pointA.getX(), pointA.getY() }, "my", null)
						+ " from CIrcleddd");
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent);*/
		
		System.out.println(pointA.getX());
		
		/*
		 * System.out.println("in the circle points are@@ " + pointA.getX() +
		 * " and " + pointA.getY());
		 * System.out.println(messageSource.getMessage("greeting", null, "my",
		 * null)+" from CIrcled");
		 * System.out.println(this.messageSource.getMessage("greeting", null,
		 * "my", null)+" from CIrcled");
		 */

	}
	/*
	 * @Override public void destroy() throws Exception {
	 * 
	 * System.out.println("before22 destroying the Cirlce object");
	 * 
	 * }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * 
	 * System.out.println("after creating the Circle Object"); }
	 * 
	 * @Override public void setApplicationContext(ApplicationContext
	 * applicationContext) throws BeansException { this.applicationContext =
	 * applicationContext;
	 * System.out.println("hashCode of the application Context is "
	 * +applicationContext.hashCode()); }
	 */

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		
		this.publisher = publisher;
		
	}

	

	/*
	 * public MessageSource getMessageSource() { return messageSource; }
	 * 
	 * 
	 * public void setMessageSource(MessageSource messageSource) {
	 * this.messageSource = messageSource; }
	 */

}
