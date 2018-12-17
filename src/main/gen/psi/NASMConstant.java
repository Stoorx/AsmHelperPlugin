// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
