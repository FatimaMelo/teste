using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace ProjetoFatima.Migrations
{
    public partial class atualizado : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<double>(
                name: "preco",
                table: "Produto",
                type: "float",
                nullable: false,
                defaultValue: 0.0);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "preco",
                table: "Produto");
        }
    }
}
