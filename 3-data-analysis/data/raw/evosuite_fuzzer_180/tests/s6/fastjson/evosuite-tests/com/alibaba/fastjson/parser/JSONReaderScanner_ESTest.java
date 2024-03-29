/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 14:51:25 GMT 2020
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279);
      jSONReaderScanner0.bp = 65279;
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 19, 1);
      jSONReaderScanner0.token = 16382;
      jSONReaderScanner0.bytesValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" 6)[e.Zg]Z\"T`z7{");
      int int0 = jSONReaderScanner0.scanType(" 6)[e.Zg]Z\"T`z7{");
      assertEquals(' ', jSONReaderScanner0.getCurrent());
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed string : \u001A
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("&?_|", 7);
      jSONReaderScanner0.nextIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed string : \u001A
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2634);
      jSONReaderScanner0.matchField(charArray0);
      assertEquals(8, jSONReaderScanner0.pos());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.serializer.CollectionCodec");
      jSONReaderScanner0.bp = (-466);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt(4585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":99,\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 910);
      assertEquals('{', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0000', '\u0000');
      jSONReaderScanner0.arrayCopy(3, charArray0, 0, 0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.close();
      jSONReaderScanner0.sub_chars(0, 0);
      assertEquals(0, jSONReaderScanner0.pos());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 158);
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertEquals('', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("name", (-2660));
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.stringVal();
      assertEquals(18, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Tb?e");
      jSONReaderScanner0.nextIdent();
      assertEquals('?', jSONReaderScanner0.getCurrent());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("Tb", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("_9lqyv:UED'7%", 1955);
      assertEquals('_', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("na?e");
      assertEquals('n', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('a', char0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '1';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 776);
      jSONReaderScanner0.nextIdent();
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((short)1, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-99");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.decimalValue();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" 6)[e.Zg]Z\"T`z7{");
      char char0 = jSONReaderScanner0.charAt(14);
      assertEquals('7', char0);
      assertEquals(' ', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("na?e");
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('n', jSONReaderScanner0.getCurrent());
      assertEquals('n', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 600);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("na?e");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.bytesValue();
      assertEquals(18, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("childZontext");
      ParserConfig parserConfig0 = new ParserConfig();
      jSONReaderScanner0.addSymbol(2041, 2110, 2041, parserConfig0.symbolTable);
      assertEquals('c', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"\":[]}");
      ParserConfig parserConfig0 = ParserConfig.global;
      String string0 = jSONReaderScanner0.addSymbol(0, 0, 1741, parserConfig0.symbolTable);
      assertEquals('{', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 96, 96);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(1, 96);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-32), 275);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state, textLength is zero", 20);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-592), 1024);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(4585, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaHa.2astjson.parser.JSONReade[Scanner");
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
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 291);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ba?e");
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
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 291);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.next();
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("true");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isEOF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
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
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner", 180);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('Q', 70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" 6)[e.Zg]Z\"T`z7{");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('1', (-630));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -630
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("X5rCmgql?t;5-Tjg", (-1));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-19), (-1), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 291);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt(291);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("kotlin.ranges.ClosedDoubleRange", 0);
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
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4598);
      jSONReaderScanner0.bp = 4598;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charArrayCompare(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 291);
      jSONReaderScanner0.scanString();
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.bytesValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("childContext", 145);
      jSONReaderScanner0.sp = (-75);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.bytesValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -75
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0000', '\u0000');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(3, charArray0, 1481, 1481);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("XOkDeX_ KSrWdk|.");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(54, (-1880), 178, defaultJSONParser0.symbolTable);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 96, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-1924), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(167);
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
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u001A', char0);
      
      int int0 = jSONReaderScanner0.indexOf('\u001A', 39);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
      jSONReaderScanner0.bp = 4585;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt(4585);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("na?e");
      jSONReaderScanner0.nextIdent();
      char char0 = jSONReaderScanner0.charAt(83);
      assertEquals(18, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(0, 122, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" 6)[e.Zg]Z\"T`z7{");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals(' ', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-99");
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
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = '0';
      charArray0[2] = 'F';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 963);
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.decimalValue();
      assertEquals(3, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'S';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 128);
      jSONReaderScanner0.nextIdent();
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
  public void test64()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("childContext");
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
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = '0';
      charArray0[2] = 'F';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 963);
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.doubleValue();
      assertEquals(3, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("S)mbTAO1ikKm&N>4i<");
      jSONReaderScanner0.nextIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.doubleValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("mL^%t|)%h<ka");
      jSONReaderScanner0.nextIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.doubleValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-99");
      jSONReaderScanner0.nextIdent();
      assertEquals(2, jSONReaderScanner0.token());
      
      double double0 = jSONReaderScanner0.doubleValue();
      assertEquals((-99.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(+\"znadz", 0);
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      jSONReaderScanner0.copyTo(152, 160, charArray0);
      assertEquals(16384, charArray0.length);
      assertEquals('', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.serializer.CollectionCodec");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-606), (-606));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -606
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 8);
      char[] charArray0 = jSONReaderScanner0.sub_chars(83, 2640);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals(2640, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(+\"znadz");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-1900), (-1900));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1900
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
      String string0 = jSONReaderScanner0.subString(4585, 10);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("^^~s>02//[J7pMA");
      jSONReaderScanner0.hasSpecial = true;
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("", string0);
      assertEquals('^', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4219);
      jSONReaderScanner0.scanFieldBoolean(charArray0);
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char char0 = jSONReaderScanner0.charAt(177);
      assertEquals('\u001A', char0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("childContext", 127);
      int int0 = jSONReaderScanner0.indexOf('C', 0);
      assertEquals('c', jSONReaderScanner0.getCurrent());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4598);
      jSONReaderScanner0.bp = 4598;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('c', 4598);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '1';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 776);
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf('1', 16384);
      assertEquals(2, jSONReaderScanner0.token());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 776);
      int int0 = jSONReaderScanner0.indexOf('1', 16384);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner", (-55));
      int int0 = jSONReaderScanner0.scanType("");
      assertEquals('c', jSONReaderScanner0.getCurrent());
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-99");
      jSONReaderScanner0.nextIdent();
      long long0 = JSONLexerBase.MULTMIN_RADIX_TEN;
      long long1 = jSONReaderScanner0.longValue();
      assertEquals(2, jSONReaderScanner0.token());
      assertEquals((-99L), long1);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M4h");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      jSONReaderScanner0.indexOf('f', 2630);
      assertTrue(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.close();
      assertEquals('M', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-99");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(10000000, 14, 14, (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(2081, (char[]) null, 1, 2081);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("childContext");
      jSONReaderScanner0.nextIdent();
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
  public void test87()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4585);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.nextIdent();
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }
}
