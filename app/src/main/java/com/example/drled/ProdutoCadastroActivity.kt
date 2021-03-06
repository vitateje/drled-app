package com.example.drled

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro_produto.*
import kotlinx.android.synthetic.main.login.*

class ProdutoCadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_produto)
        setTitle("Novo Produto")

        salvarProduto.setOnClickListener {
            val produto = Produto()
            produto.nome = nomeProduto.text.toString()
            produto.preco = precoProduto.text.toString()
            produto.descricao = descricaoProduto.text.toString()
            produto.foto = urlFoto.text.toString()

            taskAtualizar(produto)
        }
    }

    private fun taskAtualizar(produto: Produto) {
        // Thread para salvar a discilpina
        Thread {
            ProdutoService.save(produto)
            runOnUiThread {
                // após cadastrar, voltar para activity anterior
                finish()
            }
        }.start()
    }
}