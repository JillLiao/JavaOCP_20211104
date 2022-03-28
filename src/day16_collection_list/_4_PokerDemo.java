package day16_collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class _4_PokerDemo {

	public static void main(String[] args) {
		Stack<String> poker = new Stack<>();
		poker.push("A");
//		for(int i=2; i<=10; i++) poker.push(i+"");	//單行迴圈
		for(int i=2; i<=10; poker.push(i++ +""));	//沒加 ; for的掌控範圍會延至下一行
		poker.push("J");
		poker.push("Q");
		poker.push("K");
		System.out.println(poker);
		
		//洗牌
		Collections.shuffle(poker);
		System.out.println(poker);
		
//		//將排組順序顛倒
//		Collections.reverse(poker);
//		System.out.println(poker);
		
		//取前2張牌
		List<String> handCard = new ArrayList<>();
		handCard.add(poker.pop());
		handCard.add(poker.pop());
		System.out.println(handCard);		
	}

}
