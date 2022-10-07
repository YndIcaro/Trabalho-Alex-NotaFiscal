public class NotaFiscal {
//Alessandro e Icaro 3-52 Data: 07/10/2022 
    public static void main(String[] args) {
        Produto P1 = new Produto();
        P1.Produtos = "Anel";
        P1.quantidade = 1;
        P1.valor = 6.00f;

        Loja l1 = new Loja();

        l1.localizacao = ("AV CRISTOVAO COLOMBO, 67 SAVASSI");
        l1.CEP = ("CEP: 30140-140 - BELO HORIZONTE - MG");
        l1.cnpj = ("CNPJ: 28.663.093/0001-53");
        l1.IE = ("IE: 003.044314.0006");
        l1.IM = ("IM: 1.046.973/001-0");
        System.out.println("");
        System.out.println("              LARA ACESSORIOS EIRELI ME");
        System.out.println("       " + l1.localizacao);
        System.out.println("     " + l1.CEP);
        System.out.println(l1.cnpj);
        System.out.println(l1.IE);
        System.out.println(l1.IM);
        System.out.println("---------------------------------------------------------");
        System.out.println("10/07/2019 20:11:10V     CCF:05772             COD:061646");
        System.out.println("                  CUPOM FISCAL");
        System.out.println("ITEM CÓDIGO               DESCRIÇÃO");
        System.out.println("QTD UN.  VL UNIT ( R$)      ST              VL ITEM ( R$)");
        System.out.println("---------------------------------------------------------");
        System.out.println("001 00000000000 109                              " + P1.Produtos + " " + P1.valor);
        System.out.println("       " + P1.quantidade + "UN X " + P1.valor + "                02T18,00%            "
                + P1.valor + "G");
        System.out.println("                                      -------------------");
        System.out.println("TOTAL R$                                              " + P1.valor);
        System.out.println("Ct Credito                                            " + P1.valor);
        System.out.println("T2=02T18,00%");
        System.out.println("MD-5:E7B70BBEC831D240FF6D8C0DDC642AC1");
        System.out.println("MINAS LEGAL:2866309300153   10072019 600");
        System.out.println("Valor aproximado dos tributos deste cupom (Conforme Lei F");
        System.out.println("ed.   12.741/2012) R$ 1.52");
        System.out.println("---------------------------------------------------------");
        System.out.println("CONTROLE:02066054");
        System.out.println("---------------------------------------------------------");
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("Aplicativo:FRENTE.AZI - PONTO AZI SISTEMAS (31)");
        System.out.println("3721-5251");
        System.out.println("---------------------------------------------------------");
        System.out.println("AKIOLAR4   OBWMGR9U   BLL%GOUM   AEHIH4P3   N7NDBE707FGQ");
        System.out.println("BEMATECH MP-400 TH F1 ECF-IF");
        System.out.println("VERSÃO:01.00.02 ECF:001 LJ:0001");
        System.out.println("QQQQQQQQQEPRTUWRYW 10/07/2019 20:11:25V");
        System.out.println("FABBE091710100011211499");
    }

}
