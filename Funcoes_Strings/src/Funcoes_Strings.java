
public class Funcoes_Strings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-"); //imprime a string em minusculo//
		System.out.println("toUpperCase: -" + s02 + "-");//imprime a string em maisculo//
		System.out.println("trim: -" + s03 + "-");//imprime a string sem espaços//
		System.out.println("substring(2): -" + s04 + "-");//imprime da posição indicada a diante//
		System.out.println("substring(2, 9): -" + s05 + "-");//imprime da posição de 2 a 9//
		System.out.println("replace('a', 'x'): -" + s06 + "-");//substitui a string selecionada pela requerida//
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");//substitui a string selecionada pela requerida//
		System.out.println("Index of 'bc': " + i);//procura a primeira posição daquela string descrita//
		System.out.println("Last index of 'bc': " + j);//procura a ultima posição daquela string definida//
	}

}
