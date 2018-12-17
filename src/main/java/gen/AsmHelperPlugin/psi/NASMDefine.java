// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface NASMDefine extends PsiElement {

  @NotNull
  List<NASMExpr> getExprList();

  @NotNull
  PsiElement getDefineTag();

  //WARNING: getDefineIdentifier(...) is skipped
  //matching getDefineIdentifier(NASMDefine, ...)
  //methods are not found in NASMPsiImplUtil

  //WARNING: getDefineIdentifierString(...) is skipped
  //matching getDefineIdentifierString(NASMDefine, ...)
  //methods are not found in NASMPsiImplUtil

}
