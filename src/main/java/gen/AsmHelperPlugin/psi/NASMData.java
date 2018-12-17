// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NASMData extends PsiElement {

  @Nullable
  NASMIdentifier getIdentifier();

  @NotNull
  List<NASMLabelIdentifier> getLabelIdentifierList();

  @NotNull
  List<NASMNumericExpr> getNumericExprList();

  @Nullable
  PsiElement getComment();

  @NotNull
  PsiElement getDataOp();

}
