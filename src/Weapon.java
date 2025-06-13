public class Weapon extends Item {
    public Weapon() {
        super("ななしの件"); // 親クラス(Itemクラス)の引数なしコンストラクタを呼び出そうとしている。
        // が、親クラスに引数なしのコンストラクタが存在しないため、
        // super(); だと実行できないとエラーが発生して怒られている。
    }
}
