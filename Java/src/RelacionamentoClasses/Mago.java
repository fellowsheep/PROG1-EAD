package RelacionamentoClasses;

class Magia {
    private String nome;

    public Magia(String nome) {
        this.nome = nome;
    }

    public void executar() {
        System.out.println("A magia " + this.nome + " explode no ar!");
    }
}

class Item {
    public int bonusMagico;
    public String nomeItem;
    
    public Item(String nome, int bonus) {
        this.nomeItem = nome;
        this.bonusMagico = bonus;
    }

    public void brilhar() {
        System.out.println(nomeItem + " brilha com poder!");
    }
}

class Mago {
    private Magia magiaConhecida; //relação par-a-par - magia não é que faz parte, o mago usa
    private Item itemEquipado; // relação todo/parte, mas com ciclos de vida separados
    private String nome;

    public Mago(String nome)
    {
        magiaConhecida = null;
        itemEquipado = null;
        this.nome = nome;
    }

    public void falar()
    {
        System.out.println(nome + " diz: 'Pelas barbas de Merlin!'");
    }

    // O Mago aprende a magia, criando o vínculo
    public void aprenderMagia(Magia magia) {
        this.magiaConhecida = magia;
        System.out.println("O Mago memorizou o feitiço.");
    }

    public void lancarMagia() {
        if (this.magiaConhecida != null) {
            System.out.println("Mago prepara o feitiço...");
            this.magiaConhecida.executar();
        } else {
            System.out.println("O Mago não sabe nenhuma magia no momento!");
        }
    }

    // O Mago recebe o item de uma fonte externa - Exemplo de agregação!!!
    public void equiparItem(Item item) {
        this.itemEquipado = item;
        if(item != null) {
              System.out.println("Mago equipou o item.");
        }
    }

    // Aqui o desequipar apenas faz com que o mago não tenha mais acesso aos dados do item na memória,
    // item permanece existindo no Main
    public void desequiparItem() {
        itemEquipado = null;
        System.out.println("Mago desequipou o item.");
    }
    
    public void lancarMagiaForte() {
        int poderBase = 10;
        if (magiaConhecida != null)
            poderBase += 10;
        if (itemEquipado != null) {
            itemEquipado.brilhar();
            int poderTotal = poderBase + itemEquipado.bonusMagico;
            System.out.println("Mago lanca magia com poder " + poderTotal + "!");
        } 
        else {
            System.out.println("Mago lanca magia com poder " + poderBase + ".");
        }
    }

}

