package com.yuanzijian01.itcast.map;

import java.util.HashMap;
import java.util.Map;

/*
����ʵ��������Щ��������ӳ���ϵ���ڵģ�Ҳ���ǳɶԴ��ڵģ����磺 
	
	������ ��
		��                    ֵ
		
		�Ϲ�                ����
		���֤            ��
		һ��Ҫ��       ��
 ˫�м��ϣ�
-------------| Map  �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
----------------| HashMap 
----------------| TreeMap
----------------| Hashtable 
 
 Map�ӿڵķ�����
 	
 	��ӣ�
 		put(K key, V value) 
 		putAll(Map<? extends K,? extends V> m) 
 	
 	ɾ��
 		remove(Object key) 
 		clear() 

 	��ȡ��
 		get(Object key) 
 		size() 
 	
 	�жϣ�
 		containsKey(Object key) 
 		containsValue(Object value) 
 		isEmpty() 

 
 */
public class Demo2 {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		//��ӷ���
		map.put("����", "������");
		map.put("����", "�����P");
		map.put("л����","�Ű�֥");
		/*
		���
		System.out.println("����ֵ��"+map.put("л����","�Ʒ�"));  // ���֮ǰû�д��ڸü�����ô���ص���null�����֮ǰ���Ѿ����ڸü��ˣ���ô�ͷ��ظü�֮ǰ��Ӧ ��ֵ��
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("������", "�̷�");
		map2.put("ϰ��", "������");
		map.putAll(map2); // ��map2��Ԫ����ӵ�map�����С�
		
		*/
		
		/*
		ɾ��
		System.out.println("ɾ����������:"+map.remove("����")) ;  //���ݼ�ɾ��һ��map�е����ݣ����ص��Ǹü���Ӧ ��ֵ��
		map.clear(); //��ռ����е��������ݡ�
		*/
		
		/* ��ȡ
		System.out.println("����ָ�� �ļ���ȡ��Ӧ��ֵ:"+ map.get("����"));
		System.out.println("��ȡmap���ϼ�ֵ�Ը�����"+map.size());
		
		
		�ж�
		System.out.println("�ж�map�����Ƿ����ָ���ļ���"+ map.containsKey("����"));
		System.out.println("�ж�map�������Ƿ����ָ�� ��ֵ��"+ map.containsValue("�Ű�֥"));
		map.clear();
		System.out.println("�ж�map�����Ƿ�Ϊ��Ԫ�أ�"+ map.isEmpty());
		*/
		System.out.println("���ϵ�Ԫ�أ�"+ map);
		
		
	}

}