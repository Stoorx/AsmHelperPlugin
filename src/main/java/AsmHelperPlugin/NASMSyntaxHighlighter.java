package AsmHelperPlugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class NASMSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey NASM_REGISTER = TextAttributesKey.createTextAttributesKey(
            "NASM_REGISTER",
            DefaultLanguageHighlighterColors.LOCAL_VARIABLE
    );
    public static final TextAttributesKey NASM_SEGMENT_REGISTER = TextAttributesKey.createTextAttributesKey(
            "NASM_SEGMENT_REGISTER",
            DefaultLanguageHighlighterColors.GLOBAL_VARIABLE
    );
    public static final TextAttributesKey NASM_OPERATION = TextAttributesKey.createTextAttributesKey(
            "NASM_OPERATION",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NASM_SEPARATOR = TextAttributesKey.createTextAttributesKey(
            "NASM_SEPARATOR",
            DefaultLanguageHighlighterColors.COMMA
    );
    public static final TextAttributesKey NASM_NUMBER = TextAttributesKey.createTextAttributesKey(
            "NASM_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey NASM_SIZE_TYPE = TextAttributesKey.createTextAttributesKey(
            "NASM_SIZE_TYPE",
            DefaultLanguageHighlighterColors.METADATA
    );
    public static final TextAttributesKey NASM_OP_PREFIX = TextAttributesKey.createTextAttributesKey(
            "NASM_OP_PREFIX",
            DefaultLanguageHighlighterColors.METADATA
    );
    public static final TextAttributesKey NASM_COMMENT = TextAttributesKey.createTextAttributesKey(
            "NASM_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
    );
    public static final TextAttributesKey NASM_LABEL = TextAttributesKey.createTextAttributesKey(
            "NASM_LABEL",
            DefaultLanguageHighlighterColors.FUNCTION_DECLARATION
    );
    public static final TextAttributesKey NASM_IDENTIFIER = TextAttributesKey.createTextAttributesKey(
            "NASM_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER
    );
    public static final TextAttributesKey NASM_MACRO = TextAttributesKey.createTextAttributesKey(
            "NASM_MACRO",
            DefaultLanguageHighlighterColors.CONSTANT
    );
    public static final TextAttributesKey NASM_MACRO_PARAM_REF = TextAttributesKey.createTextAttributesKey(
            "NASM_MACRO_PARAM_REF",
            DefaultLanguageHighlighterColors.PARAMETER
    );
    public static final TextAttributesKey NASM_MACRO_VAR_REF = TextAttributesKey.createTextAttributesKey(
            "NASM_MACRO_VAR_REF",
            NASMSyntaxHighlighter.NASM_MACRO_PARAM_REF
    );
    public static final TextAttributesKey NASM_MACRO_LABEL = TextAttributesKey.createTextAttributesKey(
            "NASM_MACRO_LABEL",
            NASMSyntaxHighlighter.NASM_LABEL
    );
    public static final TextAttributesKey NASM_DIRECTIVE = TextAttributesKey.createTextAttributesKey(
            "NASM_DIRECTIVE",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NASM_STRING = TextAttributesKey.createTextAttributesKey(
            "NASM_STRING",
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey NASM_CONSTANT = TextAttributesKey.createTextAttributesKey(
            "NASM_CONSTANT",
            DefaultLanguageHighlighterColors.CONSTANT
    );
    public static final TextAttributesKey NASM_STRUCTURE = TextAttributesKey.createTextAttributesKey(
            "NASM_STRUCTURE",
            DefaultLanguageHighlighterColors.CLASS_NAME
    );
    public static final TextAttributesKey NASM_STRUCTURE_FIELD = TextAttributesKey.createTextAttributesKey(
            "NASM_STRUCTURE_FIELD",
            NASMSyntaxHighlighter.NASM_STRUCTURE
    );
    public static final TextAttributesKey NASM_BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(
            "NASM_BAD_CHARACTER",
            HighlighterColors.BAD_CHARACTER
    );

    private static final Map<IElementType, TextAttributesKey> keys1;
    private static final Map<IElementType, TextAttributesKey> keys2;

    static {
        keys1 = new THashMap<>();
        keys2 = new THashMap<>();

        keys1.put(NASMTypes.REGISTER, NASM_REGISTER);
        keys1.put(NASMTypes.SEGMENT_REGISTER, NASM_SEGMENT_REGISTER);

        keys1.put(NASMTypes.SEPARATOR, NASM_SEPARATOR);

        keys1.put(NASMTypes.SIZE_TYPE, NASM_SIZE_TYPE);

        keys1.put(NASMTypes.MACRO, NASM_MACRO);
        keys1.put(NASMTypes.MACRO_CALL, NASM_MACRO);
        keys1.put(NASMTypes.MACRO_PARAM_REF, NASM_MACRO_PARAM_REF);
        keys1.put(NASMTypes.MACRO_VAR_REF, NASM_MACRO_VAR_REF);
        keys1.put(NASMTypes.MACRO_PARAM_LBL_DEF, NASM_MACRO_LABEL);

        keys1.put(NASMTypes.OP_PREFIX, NASM_OP_PREFIX);
/*
        keys1.put(NASMTypes.GENERAL_OP, NASM_OPERATION);
        keys1.put(NASMTypes.SYSTEM_OP, NASM_OPERATION);
        keys1.put(NASMTypes.VIRTUALIZATION_OP, NASM_OPERATION);
        //keys1.put(NASMTypes.X64_OP, NASM_OPERATION);
        keys1.put(NASMTypes.FPU_OP, NASM_OPERATION);
        keys1.put(NASMTypes.MMX_OP, NASM_OPERATION);
        keys1.put(NASMTypes.SSE_OP, NASM_OPERATION);
        //keys1.put(NASMTypes.SSE2_OP, NASM_OPERATION);
        //keys1.put(NASMTypes.SSE3_OP, NASM_OPERATION);
        //keys1.put(NASMTypes.SSE4_OP, NASM_OPERATION);
        keys1.put(NASMTypes.AVX_OP, NASM_OPERATION);
       // keys1.put(NASMTypes.AVX2_OP, NASM_OPERATION);
        //keys1.put(NASMTypes.AVX512_OP, NASM_OPERATION);

        */

        //keys1.put(NASMTypes.DATA_OP, NASM_OPERATION);
        keys1.put(NASMTypes.INS_DATA_TRANS_MOV, NASM_OPERATION);
        keys1.put(NASMTypes.INS_DATA_TRANS_XCHG, NASM_OPERATION);
        keys1.put(NASMTypes.INS_DATA_TRANS_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_DECIMAL_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_BINARY_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_BINARY_LOGICAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_BINARY_ROTATE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_BINARY_SET, NASM_OPERATION);
        keys1.put(NASMTypes.INS_BINARY_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_CONTROL_TRANS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_STRING_DATA, NASM_OPERATION);
        keys1.put(NASMTypes.INS_INPUT_OUTPUT, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FLAG_CONTROL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SEG_REGS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MISC_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_RNG_RAND, NASM_OPERATION);
        keys1.put(NASMTypes.INS_BIT_MANIPULATION, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SYSTEM, NASM_OPERATION);
        keys1.put(NASMTypes.INS_INTEL_VMX, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AMD_SVM, NASM_OPERATION);
        keys1.put(NASMTypes.INS_64_BIT, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_DATA_TRANS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_BASIC_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_COMPARISON, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_TRANSCEND, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_LOAD, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_CONTROL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_FPU_STATE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_DATA_TRANS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_CONVERSION, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_COMPARISON, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_LOGICAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_ROTATE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_MMX_STATE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_DATA_TRANS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_COMPARISON, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_LOGICAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_CONVERSION, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_STATE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_SIMD_INT, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_CACHE_CTRL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE_PREFETCH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_DATA_TRANS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_LOGICAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_COMPARISON, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_CONVERSION, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_SIMD_INT, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE2_CACHE_CTRL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE3_GENERAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE3_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE3_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_DATA_TRANS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_BLEND, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_PACKED_INT, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_PACKED_FP, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_INS_EXT, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_CONVERSION, NASM_OPERATION);
        keys1.put(NASMTypes.INS_SSE4_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_GENERAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_AES, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_COMPARISON, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_CONVERSION, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_LOGICAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_MOV, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_ARITH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_PACKED, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_BLEND, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_CACHE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_FMA3, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX_OTHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX2_SIMD, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX2_BROADCAST, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX2_BLEND, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX2_GATHER, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_BLEND, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_BROADCAST, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_MOV, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_COMPRESS, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_CONV, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_MATH, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_LOGICAL, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_COMPARE, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_PACKED, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_PERM, NASM_OPERATION);
        keys1.put(NASMTypes.INS_AVX512_OTHER, NASM_OPERATION);


        keys1.put(NASMTypes.DIRECTIVE_OP, NASM_DIRECTIVE);
        keys1.put(NASMTypes.END_DIRECTIVE_OP, NASM_DIRECTIVE);
        keys1.put(NASMTypes.SECTION, NASM_DIRECTIVE);
        keys1.put(NASMTypes.SEGMENT, NASM_DIRECTIVE);
        keys1.put(NASMTypes.EQU, NASM_DIRECTIVE);

        keys1.put(NASMTypes.STRING, NASM_STRING);
        keys1.put(NASMTypes.CHARACTER, NASM_STRING);

        keys1.put(NASMTypes.STRUCTURE, NASM_STRUCTURE);
        keys1.put(NASMTypes.STRUCT_FIELD, NASM_STRUCTURE_FIELD);

        keys1.put(NASMTypes.CONSTANT, NASM_CONSTANT);

        keys1.put(NASMTypes.NUMERIC_LITERAL, NASM_NUMBER);
        keys1.put(NASMTypes.BINARY, NASM_NUMBER);
        keys1.put(NASMTypes.HEXADECIMAL, NASM_NUMBER);
        keys1.put(NASMTypes.ZEROES, NASM_NUMBER);
        keys1.put(NASMTypes.DECIMAL, NASM_NUMBER);
        keys1.put(NASMTypes.SEGMENT_ADDR_L, NASM_NUMBER);

        keys1.put(NASMTypes.LBL, NASM_LABEL);
        keys1.put(NASMTypes.LBL_DEF, NASM_LABEL);

        keys1.put(NASMTypes.IDENTIFIER, NASM_IDENTIFIER);

        keys1.put(NASMTypes.COMMENT, NASM_COMMENT);
        keys1.put(NASMTypes.SEMICOLON, NASM_COMMENT);

        keys1.put(TokenType.BAD_CHARACTER, NASM_BAD_CHARACTER);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NASMLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return SyntaxHighlighterBase.pack(keys1.get(tokenType), keys2.get(tokenType));
    }
}
