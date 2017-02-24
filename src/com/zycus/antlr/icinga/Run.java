package com.zycus.antlr.icinga;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;

import com.zycus.antlr.icinga.IcingaParser.IcingaObjContext;
import com.zycus.antlr.icinga.IcingaParser.ObjTypeContext;

public class Run {

	public static void main(String[] args) throws IOException {
		InputStream is = Run.class.getClassLoader().getResourceAsStream("host.conf");
		CharStream cs = new ANTLRInputStream(is);

		// Passing the input to the lexer to create tokens
		IcingaLexer lexer = new IcingaLexer(cs);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Passing the tokens to the parser to create the parse trea.
		IcingaParser parser = new IcingaParser(tokens);

		// Semantic model to be populated

		// Adding the listener to facilitate walking through parse tree.
		//parser.addParseListener(new MyIcingaObjectListener(parser));

		// invoking the parser.
		IcingaObjContext ctx = parser.icingaObj();
		System.out.println(ctx.STRING());
	}

	static class MyIcingaObjectListener extends IcingaBaseListener {

		Parser parser;

		public MyIcingaObjectListener(Parser parser) {
			this.parser = parser;
		}

//		@Override
//		public void exitIcingaObj(IcingaObjContext ctx) {
//			System.out.println(ctx.objType().getText());
//		}
		
		@Override
		public void exitObjType(ObjTypeContext ctx) {
			System.out.println(ctx.getText());
		}
	}
}
