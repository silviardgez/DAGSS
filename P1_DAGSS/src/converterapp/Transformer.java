package converterapp;

public interface Transformer {
	public String header();
	public String footer();
	public String transform(String s);
}
