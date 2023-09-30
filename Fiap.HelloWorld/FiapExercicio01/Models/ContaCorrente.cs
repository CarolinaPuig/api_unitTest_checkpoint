using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FiapExercicio01.Models
{
    sealed class ContaCorrente : Conta
    {
        public TipoConta TipoConta { get; set; }

        public void depositar() { }
        public void retirar() { }
    }
}
