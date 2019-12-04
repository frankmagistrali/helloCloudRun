import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

@Path("/dummy")
class HelloResource {

//  val log = LoggerFactory.getLogger(getClass)

//  @Context var uriInfo: UriInfo = null

  @GET
  @Path("/")
  @Produces(Array(MediaType.APPLICATION_JSON))
  def helloWorld = {
     "Hello World"
//    Response.ok("yo!")
//    log.info("Created dummy")
//    val uri = uriInfo.getAbsolutePathBuilder().path("DUMMY_STRING").build();
//    Response.created(uri).build();
  }
}