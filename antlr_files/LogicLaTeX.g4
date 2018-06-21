grammar LogicLaTeX;

//tokeny

Begin_document_sym 	: '\\documentclass{article} \\begin{document} $';
End_document_sym 	: '$ \\end{document}';

Quantifier_sym		: Exists_sym | Exists_one_sym | For_all_sym;

Exists_one_sym		: '\\exists!';
Exists_sym			: '\\exists';
For_all_sym			: '\\forall';

Operator_1arg_sym	: Neg_sym | Necessarily_sym | Possibly_sym;

Neg_sym 			: '\\neg';
Necessarily_sym	 	: '\\Box';
Possibly_sym 		: '\\Diamond';

Operator_2arg_sym	: Or_sym | And_sym | Implies_sym | Iff_sym;

Or_sym 				: '\\lor';
And_sym 			: '\\land';
Implies_sym 		: '\\implies';
Iff_sym 			: '\\iff';

Predicate_sym 		: Upper_letter_sym ( '_{' Digit_sym+ '}' )?;
Variable_sym 		: Lower_letter_sym( '_{' Digit_sym+ '}' )?;

Upper_letter_sym	: 'A'..'Z';
Lower_letter_sym	: 'a'..'z';
Digit_sym			: '0'..'9';

Equals_sym			: '=';
L_bracket_sym 		: '(';
R_bracket_sym 		: ')';
Comma_sym 			: ',';

WhiteSpace : (' '|'\t') -> skip;
NewLine : ('\r''\n'|'\r'|'\n') -> skip;


//gramatyka parsera


formula_0	: Variable_sym
			| L_bracket_sym formula_0 Operator_2arg_sym formula_0 R_bracket_sym
			| Operator_1arg_sym formula_0
			;

formula_1 	: L_bracket_sym Variable_sym Equals_sym Variable_sym R_bracket_sym
			| Predicate_sym L_bracket_sym Variable_sym (Comma_sym Variable_sym)* R_bracket_sym
			| L_bracket_sym formula_1 Operator_2arg_sym formula_1 R_bracket_sym
			| Operator_1arg_sym formula_1
			| Quantifier_sym Variable_sym formula_1
			;


program 	: Begin_document_sym (formula_0 | formula_1) End_document_sym EOF;
