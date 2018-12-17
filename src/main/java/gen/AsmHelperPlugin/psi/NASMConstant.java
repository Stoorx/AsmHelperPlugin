// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface NASMConstant extends PsiElement {

  @NotNull
  NASMIdentifier getIdentifier();

  @NotNull
  NASMNumericExpr getNumericExpr();

  @NotNull
  PsiElement getEqu();

  //WARNING: getConstantIdentifierString(...) is skipped
  //matching getConstantIdentifierString(NASMConstant, ...)
  //methods are not found in NASMPsiImplUtil

}
