import java.util.Date;
import java.sql.*;
public class ImportsCap1
{
	Date d = new Date();
	java.sql.Date dSql = new java.sql.Date(d.getTime());
	// tanto faz utilizar o .util.* como .util.Random
	// A JVM escolhe apenas as classes a serem utilizadas.

	// tudo do package .lang j� vem no java, que � automaticamente importado
	// pode haver redundancia, caso tente importar algo do .lang

	// QUANDO A JVM ENCONTRA 2 PACKAGES QUE POSSUEM A MESMA CLASSE (COM O MESMO NOME)QUE
	// SER� UTILIZADA, ELE APONTA ERRO NO IMPORT FALANDO QUE � ambiguous.
	// isto ocorre se a declara��o dos dois for implicita:( .util.Date junto com sql.Date 
	// ou .util.* com sql.*, do contrario, ele n�o aponta erros)


}
