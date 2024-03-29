/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 20:48:31 GMT 2020
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
      StringReader stringReader0 = new StringReader("4U\"b0jBO");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextTo("4U\"b0jBO");
      stringReader0.skip((-1L));
      xMLTokener0.skipPast("4U\"b0jBO");
      assertFalse(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#~2oP}rdvNHV");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~2oP}rdvNHV\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity(" @H;F{!TzCY~I[^f");
      assertEquals("& @H;F{!TzCY~I[^f;", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("nk#`&(6e,1\"*W7pd");
      try { 
        xMLTokener0.nextEntity('9');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &nk# at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MJSn]WtEFOaR9UsY5%");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("#2");
      assertEquals("\u0002", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("m@fkG0t2Uv;[j';T");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextValue();
      Object object0 = xMLTokener0.nextEntity('l');
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("E");
      stringReader0.close();
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast("E");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("MJS]WtEFOaR9UsY5%");
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      try { 
        xMLTokener0.nextEntity('n');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: & at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      xMLTokener0.skipPast("=");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i*dt?eQ3W");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.skipPast("@,");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("vGjB#Y0h^]R?.Yo");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("vGjB#Y0h^", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("S{N6A}+[0)G4cq\"");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("S{N6A}+", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" 9lVty?36@o\"y*$\"");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("9lVty", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("*k(zY=k6/*g");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("*k(zY", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Q:hv2:d<");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("7/=}xiYlV$T+=r4.ND");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("7", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("-4U\"b0j4BO");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1b7j8!AV^Hm3gtCT");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals("1b7j8", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("*&P}bmW,!2K0");
      xMLTokener0.nextMeta();
      xMLTokener0.nextMeta();
      xMLTokener0.nextToken();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'V#cK:2hXTV%DxVK8");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(">Y%Mch[RRA&RkO");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("=");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misplaced '<' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("/qDt'?};?~hrtYuN7");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"W@qg#0*g3'&0");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &0 at 13 [character 14 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z~gHjOkV-!JFo");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z~gHjOkV-!JFo");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextContent();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" J>gS;; { s~_I@~AS");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("J", object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("5x>WB:!.@y< T!M*9*J");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("n(={BR");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(".rsV@lQWYOW<");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(",:]}/\"[{;=#");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(".'.u(okOvI?}(*rX");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("S{N6A}+[0)G4cq\"");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("@,");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(":^e g'_x\u0003fY");
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?>");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(">Zr=Fgv|!V ZsKS");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("=#n=]ON[");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("</");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('<', object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("/Hg");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("' and instead saw ''");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"@jg#0w*B3D't00");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i*dt?eQ3W");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" ");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&apos;");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#x0Y<y}");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0Y<y}\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#r22sO;r] dv~HV)");
      // Undeclared exception!
      try { 
        xMLTokener0.nextEntity('m');
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"r22so\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#{UauWs&NrYi#SL\"=RlN");
      try { 
        xMLTokener0.nextContent();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &nryi#sl at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Misplaced '<'");
      Object object0 = xMLTokener0.nextContent();
      assertNotNull(object0);
      assertEquals("Misplaced '", object0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<LSg;#~F0as9\".");
      Object object0 = xMLTokener0.nextContent();
      assertNotNull(object0);
      assertEquals('<', object0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Misplaced '<'");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      xMLTokener0.nextToken();
      Object object0 = xMLTokener0.nextContent();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" ~9Y-h8A4ePD");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("C82}]]zBa}1)#cS");
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
}
