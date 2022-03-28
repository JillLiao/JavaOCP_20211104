package day24_thread_scheduled_fork_join;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class _03_Sum extends RecursiveAction {		//fork/join的範例題，RecursiveAction 表示【沒有】返回值的任務
	private static final int THRESHOLD_SIZE = 3; // 3為閾值，表示此程式設定最多只會3個數字相加，超過3個數字就要分出去計算
	int stIndex, lstIndex;
	int[] data;

	public _03_Sum(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}

	@Override
	protected void compute() {
		int sum = 0;
		if (lstIndex - stIndex <= THRESHOLD_SIZE) {
			for (int i = stIndex; i < lstIndex; i++) {
				sum += data[i];
			}
			System.out.println(sum);
		} else {
//			 new _03_Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
//			 new _03_Sum(data, stIndex, Math.min(lstIndex, stIndex +
//			 THRESHOLD_SIZE)).compute();
			_03_Sum s1 = new _03_Sum(data, stIndex + THRESHOLD_SIZE, lstIndex);
			_03_Sum s2 = new _03_Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE));
			ForkJoinTask.invokeAll(s1, s2);
		}
	}
}
