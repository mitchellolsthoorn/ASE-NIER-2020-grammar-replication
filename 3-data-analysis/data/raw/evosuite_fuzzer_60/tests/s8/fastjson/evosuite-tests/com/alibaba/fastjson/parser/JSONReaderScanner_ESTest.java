/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 09:27:03 GMT 2020
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.SymbolTable;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"\",\"value\":-99,\"value2\":false,\"number\":[]}", 95);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('{', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '|';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7);
      jSONReaderScanner0.scanIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.floatValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '-';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 5351);
      jSONReaderScanner0.nextToken();
      char char0 = jSONReaderScanner0.next();
      assertEquals(2, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"x\":hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{\"x\":\"a string\"}}");
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf(',', 0);
      assertEquals('\"', jSONReaderScanner0.getCurrent());
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"a string\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, (-1085));
      assertEquals('{', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 65536);
      char[] charArray1 = new char[5];
      jSONReaderScanner0.copyTo(1833, 2, charArray1);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 16384);
      jSONReaderScanner0.arrayCopy(138, charArray0, 0, 0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 293, 293);
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertFalse(jSONReaderScanner0.isEOF());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"a string\"", (-840));
      jSONReaderScanner0.nextToken();
      jSONReaderScanner0.stringVal();
      assertEquals(4, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = '3';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 293, 293);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("false", (-840));
      assertEquals('f', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('a', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 110, 26);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '6';
      charArray0[1] = '6';
      charArray0[2] = '6';
      charArray0[3] = '6';
      charArray0[4] = '6';
      charArray0[5] = '6';
      charArray0[6] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 7);
      jSONReaderScanner0.nextToken();
      assertEquals(2, jSONReaderScanner0.token());
      
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((short) (-18006), bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 65536);
      jSONReaderScanner0.nextToken();
      assertEquals(2, jSONReaderScanner0.token());
      
      jSONReaderScanner0.decimalValue();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '6';
      charArray0[1] = '6';
      charArray0[2] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 7);
      jSONReaderScanner0.nextToken();
      assertEquals(2, jSONReaderScanner0.token());
      
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((byte) (-102), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"illegal stat, textLength is zero\":99,\"illegal state, textLength is zero\":{},\"\":null,\"value\":-99,\"\":{}}", 95);
      char char0 = jSONReaderScanner0.charAt(95);
      assertEquals('{', jSONReaderScanner0.getCurrent());
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("false", (-840));
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('f', jSONReaderScanner0.getCurrent());
      assertEquals('f', char0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 65536);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.nextToken();
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"a string\"", (-840));
      jSONReaderScanner0.nextToken();
      jSONReaderScanner0.bytesValue();
      assertEquals(4, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 26, 65536);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      String string0 = jSONReaderScanner0.addSymbol(0, 6, 16384, parserConfig0.symbolTable);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1), 63);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536, 26);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(65536, 65536);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 95);
      jSONReaderScanner0.sp = (-1);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.stringVal();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 79, 65279);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.stringVal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isBlankInput();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"fruit\":[],\"TODO\":\"Large\",\"UseISO8601DateFormat\":-99,\"value\":-99,\"valueC\":false,\"number\":\"1\"}", 95);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('i', (-2533));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2533
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(0, 83, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{}", (-840));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charArrayCompare((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(1420, charArray0, 0, 177);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 24, 24);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(1231, 24, 593, (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 87, (-1389));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-2346), (-2346));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-840));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((String) null, 2883);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, (-1443));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null, 70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '!';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 8, (-1389));
      jSONReaderScanner0.nextToken();
      char char0 = jSONReaderScanner0.charAt(76);
      assertEquals(1, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 7);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.nextToken();
      Class<Object> class0 = Object.class;
      Collection<String> collection0 = jSONReaderScanner0.newCollectionByType(class0);
      jSONReaderScanner0.scanStringArray(collection0, '6');
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '#';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536, 26);
      jSONReaderScanner0.nextToken();
      jSONReaderScanner0.scanFieldBigInteger(charArray0);
      jSONReaderScanner0.indexOf('R', 26);
      jSONReaderScanner0.stringVal();
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 65279);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 65279);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 80);
      jSONReaderScanner0.scanIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.floatValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 26, 65536);
      jSONReaderScanner0.nextToken();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[4];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1000000, (-893));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"\":\"a string\",\"size\":99,\"color\":[],\"value\":-99,\"value2\":false,\"number\":[99]}", (-201));
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      assertEquals('{', jSONReaderScanner0.getCurrent());
      assertEquals(16384, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"\":\"a string\",\"\":-99,\"color\":[],\"value\":-99,\"value2\":false,\"number\":[99]}", (-201));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-2), (-2));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"fruit\":\"Apple\",\"TODO\":\"Large\",\"color\":\"\",\"value\":-99,\"value2\":-99}", 95);
      char[] charArray0 = jSONReaderScanner0.sub_chars(95, 123);
      assertEquals(123, charArray0.length);
      assertEquals('{', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"illegal stat, textLength is zero\":99,\"illegal state, textLength is zero\":{},\"\":null,\"value\":-99,\"\":{}}", 95);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(67, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 65536);
      jSONReaderScanner0.subString(49, 1534);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7);
      jSONReaderScanner0.hasSpecial = true;
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"a string\"", (-840));
      byte[] byteArray0 = jSONReaderScanner0.bytesValue();
      assertEquals('\"', jSONReaderScanner0.getCurrent());
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[4];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1000000, (-893));
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"a string\"", (-840));
      jSONReaderScanner0.nextToken();
      char char0 = jSONReaderScanner0.next();
      assertEquals(4, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 65279);
      int int0 = jSONReaderScanner0.indexOf('\u0000', 75);
      assertEquals(75, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"a string\"", (-840));
      jSONReaderScanner0.nextToken();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",6JY)GnULc7q{");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char char0 = jSONReaderScanner0.charAt(68);
      assertFalse(jSONReaderScanner0.isEOF());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 671, 671);
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory((ClassLoader) null);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0.classLoader);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1), 14, 119, parserConfig0.symbolTable);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 65536);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(1833, 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("B iq,");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(26, (char[]) null, 0, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 26, 65536);
      jSONReaderScanner0.indexOf('f', 66);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }
}
