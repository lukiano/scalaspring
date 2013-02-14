package com.lucho.scala

import org.springframework.beans.factory.annotation.Configurable
import com.lucho.service.MyService
import javax.inject.Inject

@Configurable
class MyScalaObject {

  @Inject
  private var myService: MyService = null

  def scalaGreet() {
      println(myService.getGreetSentence  + " So scalable")
  }

}
