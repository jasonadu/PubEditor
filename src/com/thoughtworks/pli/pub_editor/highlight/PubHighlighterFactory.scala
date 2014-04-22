package com.thoughtworks.pli.pub_editor.highlight

import com.intellij.openapi.fileTypes.{SyntaxHighlighter, SyntaxHighlighterFactory}
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.project.Project
import com.thoughtworks.pli.pub_editor.PubLanguage

class PubHighlighterFactory extends SyntaxHighlighterFactory {

  def getSyntaxHighlighter(project: Project, virtualFile: VirtualFile): SyntaxHighlighter = {
    new PubHighlighter
  }

}
