// Generated from grammars\graph\Graph.g4 by ANTLR 4.0
package com.zycus.antlr.demo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface GraphListener extends ParseTreeListener {
	void enterEdge(GraphParser.EdgeContext ctx);
	void exitEdge(GraphParser.EdgeContext ctx);

	void enterVertex(GraphParser.VertexContext ctx);
	void exitVertex(GraphParser.VertexContext ctx);

	void enterGraph(GraphParser.GraphContext ctx);
	void exitGraph(GraphParser.GraphContext ctx);
}