/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 15:41:40 GMT 2020
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
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<String, Object>, Integer>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", "");
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(abstractMap_SimpleImmutableEntry0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.reset(0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, LinkedHashTreeMap<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, LinkedHashTreeMap<Integer, String>>(comparator0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer((-1002));
      LinkedHashTreeMap.AvlBuilder<Integer, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, (-343), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node2);
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap1 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, String>();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<String, Object>(comparator1);
      Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap3 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Object>>(comparator2);
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap4 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, LinkedHashTreeMap<String, Object>> linkedHashTreeMap5 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, LinkedHashTreeMap<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("com.google.gson.internal.LinkedHashTreeMap$KeySet", "com.google.gson.internal.LinkedHashTreeMap$KeySet");
      // Undeclared exception!
      try { 
        linkedHashTreeMap5.put(abstractMap_SimpleImmutableEntry0, linkedHashTreeMap2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      LinkedHashTreeMap.AvlBuilder<Integer, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, Object>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Object object0 = linkedHashTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Object object0 = linkedHashTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer>(comparator0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      linkedHashTreeMap0.find("", false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.find("pP#vkT+@ymO(^Z^k", true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      Set<Map.Entry<String, AbstractMap.SimpleEntry<String, Integer>>> set0 = (Set<Map.Entry<String, AbstractMap.SimpleEntry<String, Integer>>>)linkedHashTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Object, Object>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object>();
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
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object>();
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(linkedHashTreeMap1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Integer, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Integer, Integer>>();
      LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Integer, Integer>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Integer, Integer>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Integer, Integer>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(2023);
      boolean boolean0 = linkedHashTreeMap0.containsKey(integer0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, String>();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_AvlIterator0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, String>>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      Integer integer0 = Integer.getInteger((String) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(integer0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      linkedHashTreeMap_AvlBuilder0.reset(20);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Comparable<Integer>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 5);
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Object>();
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<Integer>, Object>(linkedHashTreeMap_Node0, (Comparable<Integer>) null, 1, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Comparable<Integer>, Object>();
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<Comparable<Integer>, Object>(linkedHashTreeMap_Node2, (Comparable<Integer>) null, 1, linkedHashTreeMap_Node2, linkedHashTreeMap_NodeArray0[0]);
      linkedHashTreeMap_Node3.left = linkedHashTreeMap_NodeArray0[0];
      linkedHashTreeMap_NodeArray0[4] = linkedHashTreeMap_Node3;
      LinkedHashTreeMap.Node<Comparable<Integer>, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Comparable<Integer>, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(10, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Object>();
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, ",jqRMV]%V", (-1777), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>>();
      Integer integer0 = new Integer(947);
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(linkedHashTreeMap0, integer0);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(abstractMap_SimpleImmutableEntry0);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>(linkedHashTreeMap_Node0, linkedHashTreeMap_Node0, (-3369), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      linkedHashTreeMap0.keySet();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      Object object0 = new Object();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, object0, (-425), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node1;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      Object object0 = linkedHashTreeMap0.remove((Object) "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer>(comparator0);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", "");
      Integer integer0 = new Integer((-1176));
      linkedHashTreeMap0.put(abstractMap_SimpleImmutableEntry0, integer0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains((Object) null);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>>((Comparator<? super String>) null);
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap1.putAll(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Integer>();
      Integer integer0 = new Integer(2515);
      Integer integer1 = linkedHashTreeMap_Node0.setValue(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Object>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<Object, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Object>>();
      Integer integer0 = new Integer(961);
      linkedHashTreeMap0.get(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }
}