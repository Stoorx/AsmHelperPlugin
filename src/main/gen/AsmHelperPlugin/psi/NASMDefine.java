// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
