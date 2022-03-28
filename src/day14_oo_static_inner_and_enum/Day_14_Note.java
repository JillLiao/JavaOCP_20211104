package day14_oo_static_inner_and_enum;

public class Day_14_Note {
/*
 * 一、static /static inner class特性
 * 	1.冠上static的class、method、attribute都不能new，也不需要建立物件，可以直接調用、呼叫
 * 	2.冠上static後，便具有final的特性，不可以再改變
 * 	3.一般的inner class裡的變數【不可以】加上static
 * 	4.與上一點相對應的，static class裡的變數【必須】也是static
 * 	5.static的環境下無法直接使用物件類別的資源，因為無法new、也不能使用this指標，this屬於物件程式
 * 		this只能用在【物件方法】或【建構子】中
 * 
 * 二、列舉(enum)的使用與注意事項
 * 	1.列舉的目的是自行定義資料類別，避免參數誤用的狀況
 * 	2.列舉的建構子存取權限必須是private
 * 	3.主程式建立【列舉物件】時不須使用new，直接用【enum名】.【規定值】呼叫建構子
 * 
 * */
}
