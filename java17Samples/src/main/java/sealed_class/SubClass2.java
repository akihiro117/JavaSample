package sealed_class;

// permitsで指定されたクラスは必ず該当のクラスを継承しなければならない。
// sealedクラスを継承したクラスは、sealedかnon-sealedかfinalいずれかの修飾子を付けなればならない。
public non-sealed class SubClass2 extends AbstractSealedClass {
}
