// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface NASMStruc extends PsiElement {

  @NotNull
  List<NASMIdentifier> getIdentifierList();

  @NotNull
  List<NASMLabelIdentifier> getLabelIdentifierList();

  @NotNull
  List<NASMNumericExpr> getNumericExprList();

  @NotNull
  PsiElement getEndstrucTag();

  @NotNull
  PsiElement getStrucTag();

}
