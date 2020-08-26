/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 03:19:24 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.XMLTokener;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLTokener_ESTest extends XMLTokener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("' and instead saw '");
      Object object0 = xMLTokener0.nextToken();
      assertEquals(" and instead saw ", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("' and instead saw '");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#M>J");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"M>J\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity(" at ");
      assertEquals("& at ;", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("VtjUi1]aikDA6YW");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'");
      stringReader0.close();
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast("'");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("h$|;e~IA\"y]");
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XMLTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLTokener xMLTokener0 = null;
      try {
        xMLTokener0 = new XMLTokener((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLTokener xMLTokener0 = null;
      try {
        xMLTokener0 = new XMLTokener((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("h$|;e~IA\"y]");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextValue();
      Object object1 = xMLTokener0.nextEntity('f');
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#~_/lU");
      try { 
        xMLTokener0.nextEntity('|');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &# at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W\"ZH_%,Ig\"j7)J@l57");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextTo("A JSONObject text must begin with '{'");
      try { 
        xMLTokener0.nextEntity('#');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &g at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("pa");
      xMLTokener0.skipPast("pa");
      assertFalse(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("{\"x\":\"hello\",\"y\":7,\"Unable to write JSONObject value for key: \":true,\"a\":[],\"\":false,\"xx\":true}");
      xMLTokener0.skipPast("w6gJ {RpQN&ti F7\";");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&?i0-[z@Q=S#fMTqi;");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      XMLTokener xMLTokener1 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      Object object0 = xMLTokener1.nextToken();
      assertEquals("i0-", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("+E.U7G>c0W0hK");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("+E.U7G", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("r{2=0lHp&");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("r{2", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[3<:,Vka$)O|x");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 3 [character 4 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Y;:/");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("Y;:", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":99,\"b\":{}}");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      stringReader0.read();
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 5 [character 6 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("DI:wns$N5:g!AnO4");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("DI:wns$N5:g", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("LWK");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("LWK", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("F]>Rb@Zz)a e0g");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("F", object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?>");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Z8ZY<R");
      xMLTokener0.skipPast("{\"\":[],\"</\":null,\"Misshaped element\":\"a string\",\"\":{}}");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing ';' in XML entity: &");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextTo("T;VIbU!+ )_|");
      Object object0 = xMLTokener0.nextToken();
      assertEquals(";", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("f+{op?mp&zqsFj\"La");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("r{2=0lHp&");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Z8ZY<R");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(",:]}/\"[{;=#");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("zI-8\"+Cqd}9");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("gL[Ju|cz}AqXl!3'");
      xMLTokener0.nextMeta();
      xMLTokener0.nextToken();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("pa");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" line ");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("F]>Rb@Zz)a e0g");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('>', object0);
      
      Object object1 = xMLTokener0.nextToken();
      assertEquals("Rb@Zz)a", object1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?^B;");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(">p2-eyxki4=F");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("=hTre");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" <6L-j8B{Ce0&tI:es[");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('<', object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("/q5@ ;q^");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("!id");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("+E.U7G>c0W0hK");
      assertEquals("&+E.U7G>c0W0hK;", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#~/lU");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~/lU\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("m,vkC}qpj@edj_&#A");
      try { 
        xMLTokener0.nextContent();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &#a at 17 [character 18 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&gt;");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("!~!INmGij#0W<?");
      xMLTokener0.nextContent();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misplaced '<' at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<$'&A[");
      xMLTokener0.nextContent();
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &a at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      Object object0 = xMLTokener0.nextContent();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" line ");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":\"\",\"Bad character in a name\":false,\"z\":true,\"a\":[[false,[]]],\"].\":null,\"] is not a number.\":\"a string\"}");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 107 [character 108 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }
}