/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 19:52:53 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONWriter_ESTest extends JSONWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeValue("T");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create asm serializer error, verson 1.2.68, class byte
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeValue(stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeObject("Y e$5P*`!zo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jSONWriter0.writeObject((Object) "3pBti/49H4#ju7x:n\u0007");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create asm serializer error, verson 1.2.68, class byte
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeObject((Object) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      Object object0 = new Object();
      jSONWriter0.writeStartObject();
      jSONWriter0.writeValue(object0);
      jSONWriter0.writeObject(object0);
      // Undeclared exception!
      try { 
        jSONWriter0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.startObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.startObject();
      jSONWriter0.writeKey("mnst lB6$ _a-*0");
      jSONWriter0.writeKey("mnst lB6$ _a-*0");
      // Undeclared exception!
      try { 
        jSONWriter0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.startArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.endObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jSONWriter0.endArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.config((SerializerFeature) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.startObject();
      jSONWriter0.writeObject((Object) null);
      jSONWriter0.writeObject("");
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.startArray();
      jSONWriter0.startObject();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeObject("T");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.startArray();
      jSONWriter0.writeValue((Object) null);
      jSONWriter0.writeValue((Object) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartArray();
      jSONWriter0.writeStartArray();
      jSONWriter0.endArray();
      jSONWriter0.writeStartArray();
      jSONWriter0.endArray();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.startObject();
      jSONWriter0.endArray();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.startObject();
      jSONWriter0.writeObject((Object) null);
      jSONWriter0.writeStartArray();
      jSONWriter0.writeEndObject();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.writeStartObject();
      jSONWriter0.startArray();
      jSONWriter0.endObject();
      jSONWriter0.writeValue(stringWriter0);
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartArray();
      jSONWriter0.writeStartObject();
      jSONWriter0.writeEndArray();
      jSONWriter0.writeStartObject();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      jSONWriter0.config(serializerFeature0, true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jSONWriter0.writeEndObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeKey("Don)*l'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeEndArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartObject();
      jSONWriter0.startArray();
      jSONWriter0.endObject();
      jSONWriter0.writeValue((Object) null);
      jSONWriter0.writeValue((Object) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.flush();
  }
}