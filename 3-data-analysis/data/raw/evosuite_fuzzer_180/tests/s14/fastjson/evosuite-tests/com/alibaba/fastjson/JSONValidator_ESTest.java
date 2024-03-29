/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 17:47:58 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONValidator;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONValidator_ESTest extends JSONValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":false}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.pos = 646;
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 2, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      jSONValidator_UTF8InputStreamValidator0.next();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2159, 2159);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.pos = (int) (byte)46;
      jSONValidator_UTF8InputStreamValidator0.next();
      assertNull(jSONValidator_UTF8InputStreamValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":7,\"\":{},\"a\":[true,-99]}");
      char[] charArray0 = new char[1];
      stringReader0.read(charArray0);
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.ch = '{';
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 6
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("{1");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.next();
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":false,\"value\":true,\"value2\":false,\"number\":\"1\"}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.next();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[99],\"b\":{}}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("null");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.skipWhiteSpace();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = JSONValidator.isWhiteSpace('I');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":true,\"\":[\"a string\",-99]}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.any();
      JSONValidator.Type jSONValidator_Type0 = jSONValidator_ReaderValidator0.getType();
      assertEquals(JSONValidator.Type.Object, jSONValidator_Type0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":0.0\"\":nul2]l}");
      jSONValidator_UTF16Validator0.fieldName();
      // Undeclared exception!
      jSONValidator_UTF16Validator0.validate();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1920), 13);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 114);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.from((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{}");
      stringReader0.close();
      // Undeclared exception!
      try { 
        JSONValidator.from((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.from((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3~Zojm]\"");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.close();
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.fieldName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("Lq_");
      jSONValidator_UTF16Validator0.pos = (-1692);
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.fieldName();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("@w");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[{\"\":99},{},true]");
      jSONValidator_UTF16Validator0.fieldName();
      // Undeclared exception!
      jSONValidator_UTF16Validator0.any();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[{\"\":false},null,true]");
      jSONValidator_UTF16Validator0.pos = (-1904);
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7B|jMz");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.pos = (-733);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("null");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      jSONValidator_ReaderValidator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("");
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)9;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("@z2=S\\#|A~}PMU5");
      // Undeclared exception!
      jSONValidator_UTF16Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-19);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)8;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)12;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)10;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (byte)13);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(bufferedInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)32;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("null");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.eof = true;
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("null");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n}iW:68R,*S~ha: szi");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[false,true]");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Array, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[falsXe,null]");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 5
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("fale");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("fase");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("f,lse");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("true");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      stringReader0.reset();
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 2, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("true");
      boolean boolean0 = jSONValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("{\"com.alibaba.fastjson.JSONValidator$UTF8Validator\":-1.0,\"\":[null],\"com.alibaba.fastjson.JSONException\":true}");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[{},null,tr.e]");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 11
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("tnEyPA$6NvZL");
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"error, readCount \":true,\"com.alibaba.fastjson.JSONValidator$UTF8Validator\":[null,\"a string\"],\"$VALUES\":\"a string\"}");
      jSONValidator_UTF16Validator0.next();
      jSONValidator_UTF16Validator0.ch = '7';
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.0}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.,\"\":null}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 6
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[{}null,true]");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[{\", pos \":[]},null,true]");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Array, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\"{},\"Object\":[]}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[{\"com.alibaba.fastjson.JSONException\":false},null,true,-99]");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Array, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("8ML#t0U{T^");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("6Yy%3NDLVJfB");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("5\"Bm");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)52;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF8InputStreamValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3~Zojm]\"");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("26AT${io G-_[2R9>XZ");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("1");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)43;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("[{\", pos \":\"a string\"},null,99,-99,false]");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Array, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.0,\"\":null}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.0,\"\":null}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.supportMultiValue = false;
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b<~niX");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      jSONValidator0.close();
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.getType();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("{\"\":0.0\"\":nul2]l}");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 13
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.close();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      File file0 = MockFile.createTempFile("{\"\":false,\", valueCount : \":\"a string\"}", "{\"\":false,\", valueCount : \":\"a string\"}");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) mockFileInputStream0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[{\"com.alibaba.fastjson.JSONException\":false},null,{\"\":-99},-99]");
      jSONValidator_UTF16Validator0.close();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }
}
