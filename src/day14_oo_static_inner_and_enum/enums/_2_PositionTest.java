package day14_oo_static_inner_and_enum.enums;

public class _2_PositionTest {

	public static void main(String[] args) {
		int bonus = 5000;
		printBonus(_1_Position.協理, bonus);
		printBonus(_1_Position.專員, bonus);
		
		printBonus(6, bonus);
		printBonus(2, bonus);
		
		printBonus(100, bonus);
		printBonus(-100, bonus);
		//因為只要填數字進去就可以，即便該數字不是規定的職務編號程式仍可運行，用interface的寫法存在這樣的漏洞，
		//導致日後再新增職務、檢查、維護上都相當的麻煩，因此Java5之後發展出了enum(列舉)，只能使用規定的東西，大大減少了誤用的狀況與維護的難度
	}
	
	public static void printBonus(int pos, int bonus) {
		if (pos >=1 && pos <= 10) {						//雖然暫時可用if將錯誤的參數濾掉，但萬一未來值為基數有更動時，判斷式要逐一修改
		int real_bonus = pos * bonus;					//有許多程式都用到本程式，這維護起來很痛苦，建議直接砍掉重寫，用enum
		System.out.println(real_bonus);
		}
		else {
			System.out.println("職位基數不符合規定");
		}
	}

}
