import javax.ws.rs.core.UriBuilder
import org.glassfish.jersey.jetty.JettyHttpContainerFactory
import org.glassfish.jersey.server.ResourceConfig

object main {

  def main(args: Array[String]) : Unit = {
    JettyHttpContainerFactory.createServer(
      UriBuilder.fromUri("http://localhost/").port(9998).build(),
      new ResourceConfig(classOf[HelloResource])
    )
  }
}
