using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace ProjetoFatima.Models
{
    [Table("Produto")]
    public class Produto
    {
        [Column("id")]
        [Display(Name = "Código")]
        public int Id { get; set; }

        [Column("nome")]
        [Display(Name = "Produto")]
        public string Nome { get; set; }

        [Column("preco")]
        [Display(Name = "Preço")]
        public double Preco { get; set; }




    }
}
