using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Filtering and sorting page details
    /// </summary>
    public sealed class RequestedPageDetails:  IEquatable<RequestedPageDetails>
    { 
        /// <summary>
        /// Start
        /// </summary>
        public int? Start { get; private set; }

        /// <summary>
        /// Limit
        /// </summary>
        public int? Limit { get; private set; }

        /// <summary>
        /// OrderBy
        /// </summary>
        public string OrderBy { get; private set; }

        /// <summary>
        /// Property
        /// </summary>
        public List<string> Property { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// Next
        /// </summary>
        public int? Next { get; private set; }

        /// <summary>
        /// Prev
        /// </summary>
        public int? Prev { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RequestedPageDetails.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RequestedPageDetails()
        {
        }

        private RequestedPageDetails(int? Start, int? Limit, string OrderBy, List<string> Property, string Type, int? Next, int? Prev)
        {
            
            this.Start = Start;
            
            this.Limit = Limit;
            
            this.OrderBy = OrderBy;
            
            this.Property = Property;
            
            this.Type = Type;
            
            this.Next = Next;
            
            this.Prev = Prev;
            
        }

        /// <summary>
        /// Returns builder of RequestedPageDetails.
        /// </summary>
        /// <returns>RequestedPageDetailsBuilder</returns>
        public static RequestedPageDetailsBuilder Builder()
        {
            return new RequestedPageDetailsBuilder();
        }

        /// <summary>
        /// Returns RequestedPageDetailsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RequestedPageDetailsBuilder</returns>
        public RequestedPageDetailsBuilder With()
        {
            return Builder()
                .Start(Start)
                .Limit(Limit)
                .OrderBy(OrderBy)
                .Property(Property)
                .Type(Type)
                .Next(Next)
                .Prev(Prev);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RequestedPageDetails other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RequestedPageDetails.
        /// </summary>
        /// <param name="left">Compared (RequestedPageDetails</param>
        /// <param name="right">Compared (RequestedPageDetails</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RequestedPageDetails left, RequestedPageDetails right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RequestedPageDetails.
        /// </summary>
        /// <param name="left">Compared (RequestedPageDetails</param>
        /// <param name="right">Compared (RequestedPageDetails</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RequestedPageDetails left, RequestedPageDetails right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RequestedPageDetails.
        /// </summary>
        public sealed class RequestedPageDetailsBuilder
        {
            private int? _Start;
            private int? _Limit;
            private string _OrderBy;
            private List<string> _Property;
            private string _Type;
            private int? _Next;
            private int? _Prev;

            internal RequestedPageDetailsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.Start property.
            /// </summary>
            /// <param name="value">Start</param>
            public RequestedPageDetailsBuilder Start(int? value)
            {
                _Start = value;
                return this;
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.Limit property.
            /// </summary>
            /// <param name="value">Limit</param>
            public RequestedPageDetailsBuilder Limit(int? value)
            {
                _Limit = value;
                return this;
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.OrderBy property.
            /// </summary>
            /// <param name="value">OrderBy</param>
            public RequestedPageDetailsBuilder OrderBy(string value)
            {
                _OrderBy = value;
                return this;
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.Property property.
            /// </summary>
            /// <param name="value">Property</param>
            public RequestedPageDetailsBuilder Property(List<string> value)
            {
                _Property = value;
                return this;
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public RequestedPageDetailsBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.Next property.
            /// </summary>
            /// <param name="value">Next</param>
            public RequestedPageDetailsBuilder Next(int? value)
            {
                _Next = value;
                return this;
            }

            /// <summary>
            /// Sets value for RequestedPageDetails.Prev property.
            /// </summary>
            /// <param name="value">Prev</param>
            public RequestedPageDetailsBuilder Prev(int? value)
            {
                _Prev = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RequestedPageDetails.
            /// </summary>
            /// <returns>RequestedPageDetails</returns>
            public RequestedPageDetails Build()
            {
                Validate();
                return new RequestedPageDetails(
                    Start: _Start,
                    Limit: _Limit,
                    OrderBy: _OrderBy,
                    Property: _Property,
                    Type: _Type,
                    Next: _Next,
                    Prev: _Prev
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}