# Query: 
# Flags: CaseSensitive
# ContextLines: 1

package assetManagement;

public class Account {

	public class Asset_Management {

		public static void main(String[] args) {
			int[] assetList = { 100000, 50000, 200000 };
			int count = 0;
			for (int i = 0; i < assetList.length; i++) {
				if (assetList[i] >= 100000) {
					count++;
				}
			}
			System.out.println("10万円以上の金融資産がある口座数は" + count + "個です。");
		}
	}
}
