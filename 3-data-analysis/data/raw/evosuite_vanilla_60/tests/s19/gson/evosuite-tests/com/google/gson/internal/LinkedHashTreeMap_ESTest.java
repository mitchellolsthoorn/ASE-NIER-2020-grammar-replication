/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 16:29:17 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      linkedHashTreeMap0.get("");
      LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_AvlIterator1 = new LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, Object>, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String>(linkedHashTreeMap_Node0, linkedHashTreeMap1, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.first();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      LinkedHashTreeMap.AvlBuilder<Object, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Iterator<Map.Entry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, String>>> iterator0 = (Iterator<Map.Entry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, String>>>)linkedHashTreeMap_EntrySet0.iterator();
      LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Object>();
      linkedHashTreeMap2.findByObject(iterator0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey("BfvfrQm");
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap1.put("BfvfrQm", linkedHashTreeMap0);
      assertEquals(1, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, String>>((Comparator<? super String>) null);
      linkedHashTreeMap0.get((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      linkedHashTreeMap0.find("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.find("com.google.gson.internal.LinkedHashTreeMap$Node", true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>(comparator0);
      Set<Map.Entry<Integer, Integer>> set0 = (Set<Map.Entry<Integer, Integer>>)linkedHashTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Integer, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, String>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, String>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>((Comparator<? super Object>) null);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>((Object) null, (Object) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(abstractMap_SimpleImmutableEntry0, (AbstractMap.SimpleImmutableEntry<Integer, String>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Integer, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Comparable<Map.Entry<Object, Object>>, AbstractMap.SimpleImmutableEntry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Object>>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Integer>, String>();
      linkedHashTreeMap0.table = null;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, Object>, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node1);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Integer>, String>();
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      boolean boolean0 = linkedHashTreeMap0.containsKey("com.google.gson.^nternal.LinkedHashTreeMap");
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>();
      AbstractMap.SimpleEntry<Integer, LinkedHashTreeMap<String, String>> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, LinkedHashTreeMap<String, String>>((Integer) null, linkedHashTreeMap1);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains((Object) null);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 8);
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleEntry<Map.Entry<Object, Object>, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Map.Entry<Object, Object>, Integer>(abstractMap_SimpleImmutableEntry0, (Integer) null);
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, (-601), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(16, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 10);
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleEntry<Map.Entry<Object, Object>, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Map.Entry<Object, Object>, Integer>(abstractMap_SimpleImmutableEntry0, (Integer) null);
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, (-629), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Map.Entry<Map.Entry<Object, Object>, Integer>, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(20, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>(linkedHashTreeMap_Node0, (Map.Entry<Object, String>) null, 397, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node3);
      
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node4 = linkedHashTreeMap_Node3.last();
      assertNotNull(linkedHashTreeMap_Node4);
      assertNotSame(linkedHashTreeMap_Node4, linkedHashTreeMap_Node3);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, "y7", (-2435), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>(linkedHashTreeMap_Node2, integer0, 0, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      Iterator<AbstractMap.SimpleEntry<Object, String>> iterator0 = linkedHashTreeMap_KeySet0.iterator();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap1, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(iterator0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleEntry<Integer, String>>();
      Set<AbstractMap.SimpleImmutableEntry<Integer, String>> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, String>(comparator0);
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>();
      Integer integer0 = new Integer(1340);
      linkedHashTreeMap0.containsValue(linkedHashTreeMap1);
      linkedHashTreeMap0.containsValue(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap<LinkedHashTreeMap<String, Integer>, String> linkedHashTreeMap1 = new LinkedHashTreeMap<LinkedHashTreeMap<String, Integer>, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, String>(linkedHashTreeMap_Node0, linkedHashTreeMap0, (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap1.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<Integer, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<Integer, Integer>>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>(comparator0);
      linkedHashTreeMap1.findByEntry(linkedHashTreeMap_Node1);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String>();
      Integer integer0 = new Integer((-1));
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, (Integer) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      Integer integer0 = Integer.valueOf(1324);
      Function<Object, Object> function0 = Function.identity();
      linkedHashTreeMap0.computeIfAbsent(integer0, function0);
      linkedHashTreeMap0.entrySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>>();
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((String) null, "'rpCTHIHQ|v");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      linkedHashTreeMap_AvlBuilder0.reset((-970));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, String>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>((Object) null, (Integer) null);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, String>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, 1567, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      String string0 = linkedHashTreeMap_Node1.setValue(" is not Comparable");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer integer0 = new Integer(1340);
      LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(integer0, integer0);
      LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, 7, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Object object0 = linkedHashTreeMap_Node1.getKey();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = linkedHashTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }
}