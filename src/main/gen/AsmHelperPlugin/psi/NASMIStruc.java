// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMIStruc extends PsiElement {

  @NotNull
  List<NASMExpr> getExprList();

  @NotNull
  List<NASMNumericExpr> getNumericExprList();

  @NotNull
  PsiElement getIendTag();

  @NotNull
  PsiElement getIstrucTag();

}
