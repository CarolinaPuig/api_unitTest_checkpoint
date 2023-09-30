using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FiapExercicio01.Models
{
    internal class ContaPoupanca : Conta, IContaInvestimento
    {
        public float _rendimento;
        public float Taxa { get; set; }

        public void calculaRetornoInvestimento()
        {
            throw new NotImplementedException();
        }
    }
}
