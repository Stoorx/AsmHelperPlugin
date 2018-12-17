package AsmHelperPlugin;

import com.intellij.lexer.FlexAdapter;
import gen.AsmHelperPlugin._NASMLexer;


public class NASMLexerAdapter extends FlexAdapter {
    public NASMLexerAdapter() {
        super(new _NASMLexer());
    }
}
