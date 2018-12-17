// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NASMPreprocessor extends PsiElement {

  @Nullable
  NASMAssign getAssign();

  @Nullable
  NASMConditional getConditional();

  @Nullable
  NASMDefine getDefine();

  @Nullable
  NASMError getError();

  @NotNull
  List<NASMExpr> getExprList();

  @Nullable
  NASMInclude getInclude();

  @Nullable
  NASMMacro getMacro();

  @Nullable
  NASMStrlen getStrlen();

  @Nullable
  PsiElement getPreprocessorOp();

}
