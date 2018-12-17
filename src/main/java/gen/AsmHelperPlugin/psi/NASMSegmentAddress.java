// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface NASMSegmentAddress extends NASMExpr {

  @Nullable
  NASMLabelDefMacro getLabelDefMacro();

  @Nullable
  NASMMacroCall getMacroCall();

  @Nullable
  PsiElement getHexadecimal();

  @Nullable
  PsiElement getId();

  @Nullable
  PsiElement getLbl();

  @Nullable
  PsiElement getLblDef();

  @Nullable
  PsiElement getSegmentAddrL();

  @Nullable
  PsiElement getZeroes();

}
