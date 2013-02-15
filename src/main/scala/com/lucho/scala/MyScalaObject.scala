package com.lucho.scala

import org.springframework.beans.factory.annotation.Configurable
import com.lucho.service.MyService
import javax.inject.Inject

@Configurable
class MyScalaObject {


  /**
   * Scala good practices recommend inmmutability for their objects. In that case
   * it would be better to use constructor injection and this field to be final (val).
   * However, constructor injection is not possible via classloading.
   */
  @Inject
  private var myService: MyService = null

  def scalaGreet() {
      println(myService.getGreetSentence  + " So scalable")
  }

}
