# 📋 Projeto: Worker Management System

## 📊 Diagrama de Classes

```
# Worker
- name : String  
- level : WorkerLevel  
- baseSalary : Double  
- department : Department
- contracts : List<HourContract>

+ addContract(contract : HourContract) : void  
+ removeContract(contract : HourContract) : void  
+ income(year : Integer, month : Integer) : Double  
```

```
## 1. Department
- name : String  
```

```
## 2. HourContract
- date : Date  
- valuePerHour : Double  
- hours : Integer  

+ totalValue() : Double  
```

```
<<enum>>
WorkerLevel
- JUNIOR
- MID_LEVEL  
- SENIOR
```

## 🎯 Conceitos Aplicados

### 🔗 Composição
- **Worker** possui um **Department** (composição)
- **Worker** possui vários **HourContract** (agregação)
- **Worker** possui um **WorkerLevel** (enumeração)

### 📦 Matrizes e Coleções
- Uso de `List<HourContract>` para gerenciar múltiplos contratos
- Implementação de métodos para adicionar/remover contratos

### ⚙️ Funcionalidades Principais
1. **Cálculo de rendimento** baseado em contratos por período
2. **Gestão de contratos** com adição e remoção
3. **Hierarquia de níveis** profissionais via enumeração

## 🚀 Como Executar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/worker-management.git

# Compile o projeto
javac -d bin src/*.java

# Execute a aplicação
java -cp bin Main
```

```

## 📋 Requisitos
- Java JDK 11+
- Conhecimento em POO
- Entendimento de composição e agregação

## 🎓 Objetivos de Aprendizado
- ✅ Composição entre classes
- ✅ Uso de enums em Java
- ✅ Manipulação de listas e coleções
- ✅ Implementação de métodos complexos
- ✅ Tratamento de datas e cálculos

