package io.davis.https.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * Created by Davis on 17/7/15.
 */
public class HttpsConfig {
//  @Bean
//  public EmbeddedServletContainerFactory servletContainer() {
//    TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//      @Override
//      protected void postProcessContext(Context context) {
//        SecurityConstraint constraint = new SecurityConstraint();
//        constraint.setUserConstraint("CONFIDENTIAL");
//        SecurityCollection collection = new SecurityCollection();
//        collection.addPattern("/*");
//        constraint.addCollection(collection);
//        context.addConstraint(constraint);
//      }
//    };
//    tomcat.addAdditionalTomcatConnectors(httpConnector());
//    return tomcat;
//  }
//
//  @Bean
//  public Connector httpConnector() {
//    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//    connector.setScheme("http");
//    //Connector监听的http的端口号
//    connector.setPort(8889);
//    connector.setSecure(false);
//    //监听到http的端口号后转向到的https的端口号
//    connector.setRedirectPort(8889);
//    return connector;
//  }
}
