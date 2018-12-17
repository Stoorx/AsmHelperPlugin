// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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
