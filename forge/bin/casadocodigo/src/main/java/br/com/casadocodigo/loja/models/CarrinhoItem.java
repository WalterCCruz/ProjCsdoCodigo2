package br.com.casadocodigo.loja.models;
import br.com.casadocodigo.loja.models.TipoPreco;

public class CarrinhoItem {
	
	private TipoPreco TipoPreco;
	private Produto produto;
	

	public CarrinhoItem(Produto produto, TipoPreco tipoPreco) {
		
		
		this.produto = produto;
		this.TipoPreco = tipoPreco;
		
		
	}


	public TipoPreco getTipoPreco() {
		return TipoPreco;
	}


	public void setTipoPreco(TipoPreco tipoPreco) {
		TipoPreco = tipoPreco;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TipoPreco == null) ? 0 : TipoPreco.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarrinhoItem other = (CarrinhoItem) obj;
		if (TipoPreco != other.TipoPreco)
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
	
	

}
