package AsmHelperPlugin;

import AsmHelperPlugin.psi.NASMFile;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import gen.AsmHelperPlugin.NASMParser;
import gen.AsmHelperPlugin.psi.NASMTypes;
import org.jetbrains.annotations.NotNull;

public class NASMParserDefinition implements ParserDefinition {
    private static final TokenSet WHITE_SPACES = TokenSet.WHITE_SPACE;
    private static final TokenSet COMMENTS = TokenSet.create(NASMTypes.COMMENT);
    private static final IFileElementType FILE = new IFileElementType(NASMLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new NASMLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new NASMParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return NASMTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new NASMFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
