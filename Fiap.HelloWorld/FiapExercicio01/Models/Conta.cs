using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FiapExercicio01.Models
{
    public abstract class Conta
    {
        public string Agencia { get; set; }
        public DateTime DataAbertura { get; set;}
        public int Numero { get; set; }
        public float Saldo { get; set; }  
        public TipoConta TipoConta { get; set; }

        public void Depositar()
        {
            Console.WriteLine("Valor depositado na conta");
        }
        
        public void Retirar()
        {
            Console.WriteLine("Valor retirado da conta");
        }
    }

    public enum TipoConta
    {
        COMUM, ESPECIAL, PREMIUM
    }
}
