package utils


import io.gatling.http.Predef.Proxy
import io.gatling.http.protocol.ProxyBuilder

object LocalHttpProxy
{
  val proxy: ProxyBuilder = Proxy("localhost", 8866);
}
